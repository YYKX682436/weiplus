package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class u2 implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public o.r f91261d;

    /* renamed from: e, reason: collision with root package name */
    public o.u f91262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b f91263f;

    public u2(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b) {
        this.f91263f = c0102x1f44235b;
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
        if (this.f91262e != null) {
            o.r rVar = this.f91261d;
            boolean z18 = false;
            if (rVar != null) {
                int size = rVar.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    if (this.f91261d.getItem(i17) == this.f91262e) {
                        z18 = true;
                        break;
                    }
                    i17++;
                }
            }
            if (z18) {
                return;
            }
            h(this.f91261d, this.f91262e);
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        o.u uVar;
        o.r rVar2 = this.f91261d;
        if (rVar2 != null && (uVar = this.f91262e) != null) {
            rVar2.d(uVar);
        }
        this.f91261d = rVar;
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
    }

    @Override // o.g0
    /* renamed from: getId */
    public int mo2872x5db1b11() {
        return 0;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = this.f91263f;
        android.view.KeyEvent.Callback callback = c0102x1f44235b.f91019o;
        if (callback instanceof n.c) {
            ((n.c) callback).b();
        }
        c0102x1f44235b.removeView(c0102x1f44235b.f91019o);
        c0102x1f44235b.removeView(c0102x1f44235b.f91018n);
        c0102x1f44235b.f91019o = null;
        java.util.ArrayList arrayList = c0102x1f44235b.K;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f91262e = null;
                c0102x1f44235b.requestLayout();
                uVar.I = false;
                uVar.f423350t.p(false);
                return true;
            }
            c0102x1f44235b.addView((android.view.View) arrayList.get(size));
        }
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = this.f91263f;
        android.widget.ImageButton imageButton = c0102x1f44235b.f91018n;
        int i17 = c0102x1f44235b.f91024t;
        if (imageButton == null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a c0084x6ce1fb8a = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a(c0102x1f44235b.getContext(), null, com.p314xaae8f345.mm.R.C30857x2dd9f1.f560000km);
            c0102x1f44235b.f91018n = c0084x6ce1fb8a;
            c0084x6ce1fb8a.setImageDrawable(c0102x1f44235b.f91016i);
            c0102x1f44235b.f91018n.setContentDescription(c0102x1f44235b.f91017m);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams generateDefaultLayoutParams = c0102x1f44235b.generateDefaultLayoutParams();
            generateDefaultLayoutParams.f90603a = (i17 & 112) | 8388611;
            generateDefaultLayoutParams.f91031b = 2;
            c0102x1f44235b.f91018n.setLayoutParams(generateDefaultLayoutParams);
            c0102x1f44235b.f91018n.setOnClickListener(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t2(c0102x1f44235b));
        }
        android.view.ViewParent parent = c0102x1f44235b.f91018n.getParent();
        if (parent != c0102x1f44235b) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(c0102x1f44235b.f91018n);
            }
            c0102x1f44235b.addView(c0102x1f44235b.f91018n);
        }
        android.view.View actionView = uVar.getActionView();
        c0102x1f44235b.f91019o = actionView;
        this.f91262e = uVar;
        android.view.ViewParent parent2 = actionView.getParent();
        if (parent2 != c0102x1f44235b) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(c0102x1f44235b.f91019o);
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams generateDefaultLayoutParams2 = c0102x1f44235b.generateDefaultLayoutParams();
            generateDefaultLayoutParams2.f90603a = (i17 & 112) | 8388611;
            generateDefaultLayoutParams2.f91031b = 2;
            c0102x1f44235b.f91019o.setLayoutParams(generateDefaultLayoutParams2);
            c0102x1f44235b.addView(c0102x1f44235b.f91019o);
        }
        int childCount = c0102x1f44235b.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            android.view.View childAt = c0102x1f44235b.getChildAt(childCount);
            if (((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) childAt.getLayoutParams()).f91031b != 2 && childAt != c0102x1f44235b.f91011d) {
                c0102x1f44235b.removeViewAt(childCount);
                c0102x1f44235b.K.add(childAt);
            }
        }
        c0102x1f44235b.requestLayout();
        uVar.I = true;
        uVar.f423350t.p(false);
        android.view.KeyEvent.Callback callback = c0102x1f44235b.f91019o;
        if (callback instanceof n.c) {
            ((n.c) callback).d();
        }
        return true;
    }
}
