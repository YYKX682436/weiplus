package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class u2 implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public o.r f9728d;

    /* renamed from: e, reason: collision with root package name */
    public o.u f9729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f9730f;

    public u2(androidx.appcompat.widget.Toolbar toolbar) {
        this.f9730f = toolbar;
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        return null;
    }

    @Override // o.g0
    public void c(boolean z17) {
        if (this.f9729e != null) {
            o.r rVar = this.f9728d;
            boolean z18 = false;
            if (rVar != null) {
                int size = rVar.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    if (this.f9728d.getItem(i17) == this.f9729e) {
                        z18 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (z18) {
                return;
            }
            h(this.f9728d, this.f9729e);
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        o.u uVar;
        o.r rVar2 = this.f9728d;
        if (rVar2 != null && (uVar = this.f9729e) != null) {
            rVar2.d(uVar);
        }
        this.f9728d = rVar;
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
    }

    @Override // o.g0
    public int getId() {
        return 0;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        androidx.appcompat.widget.Toolbar toolbar = this.f9730f;
        android.view.KeyEvent.Callback callback = toolbar.f9486o;
        if (callback instanceof n.c) {
            ((n.c) callback).b();
        }
        toolbar.removeView(toolbar.f9486o);
        toolbar.removeView(toolbar.f9485n);
        toolbar.f9486o = null;
        java.util.ArrayList arrayList = toolbar.K;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f9729e = null;
                toolbar.requestLayout();
                uVar.I = false;
                uVar.f341817t.p(false);
                return true;
            }
            toolbar.addView((android.view.View) arrayList.get(size));
        }
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        androidx.appcompat.widget.Toolbar toolbar = this.f9730f;
        android.widget.ImageButton imageButton = toolbar.f9485n;
        int i17 = toolbar.f9491t;
        if (imageButton == null) {
            androidx.appcompat.widget.AppCompatImageButton appCompatImageButton = new androidx.appcompat.widget.AppCompatImageButton(toolbar.getContext(), null, com.tencent.mm.R.attr.f478467km);
            toolbar.f9485n = appCompatImageButton;
            appCompatImageButton.setImageDrawable(toolbar.f9483i);
            toolbar.f9485n.setContentDescription(toolbar.f9484m);
            androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
            generateDefaultLayoutParams.f9070a = (i17 & 112) | 8388611;
            generateDefaultLayoutParams.f9498b = 2;
            toolbar.f9485n.setLayoutParams(generateDefaultLayoutParams);
            toolbar.f9485n.setOnClickListener(new androidx.appcompat.widget.t2(toolbar));
        }
        android.view.ViewParent parent = toolbar.f9485n.getParent();
        if (parent != toolbar) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(toolbar.f9485n);
            }
            toolbar.addView(toolbar.f9485n);
        }
        android.view.View actionView = uVar.getActionView();
        toolbar.f9486o = actionView;
        this.f9729e = uVar;
        android.view.ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(toolbar.f9486o);
            }
            androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams2 = toolbar.generateDefaultLayoutParams();
            generateDefaultLayoutParams2.f9070a = (i17 & 112) | 8388611;
            generateDefaultLayoutParams2.f9498b = 2;
            toolbar.f9486o.setLayoutParams(generateDefaultLayoutParams2);
            toolbar.addView(toolbar.f9486o);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            android.view.View childAt = toolbar.getChildAt(childCount);
            if (((androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams()).f9498b != 2 && childAt != toolbar.f9478d) {
                toolbar.removeViewAt(childCount);
                toolbar.K.add(childAt);
            }
        }
        toolbar.requestLayout();
        uVar.I = true;
        uVar.f341817t.p(false);
        android.view.KeyEvent.Callback callback = toolbar.f9486o;
        if (callback instanceof n.c) {
            ((n.c) callback).d();
        }
        return true;
    }
}
