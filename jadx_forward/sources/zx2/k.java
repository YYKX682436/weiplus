package zx2;

/* loaded from: classes2.dex */
public class k extends zx2.i {

    /* renamed from: c, reason: collision with root package name */
    public boolean f558578c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f558579d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f558580e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f558581f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.CharSequence f558582g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f558583h;

    /* renamed from: i, reason: collision with root package name */
    public final int f558584i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f558585j;

    public k(java.lang.CharSequence title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f558582g = "";
        this.f558583h = "";
        this.f558582g = title;
    }

    @Override // zx2.i
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b3x;
    }

    @Override // zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f558585j = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nuw);
        }
    }

    @Override // zx2.i
    public void d(boolean z17, android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        e(z17);
        if (z17) {
            if (this.f558578c) {
                return;
            }
            if (!this.f558579d) {
                if (z17) {
                    this.f558579d = true;
                } else {
                    this.f558581f = true;
                }
                if (!(h() == 0 || this.f558573a != 0)) {
                    return;
                }
            }
            f(tabView);
            this.f558578c = true;
            return;
        }
        if (this.f558580e) {
            return;
        }
        if (!this.f558581f) {
            if (z17) {
                this.f558579d = true;
            } else {
                this.f558581f = true;
            }
            if (!(h() == 0 || this.f558573a != 0)) {
                return;
            }
        }
        g(tabView);
        this.f558580e = true;
    }

    @Override // zx2.i
    public void e(boolean z17) {
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            android.content.Context context = textView.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            textView.setText(i(context));
            k(z17);
            j(z17);
        }
    }

    public void f(android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTab", "firstValidSelected");
    }

    public void g(android.view.ViewGroup tabView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabView, "tabView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTab", "firstValidUnSelected");
    }

    public int h() {
        return 0;
    }

    public final java.lang.CharSequence i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.CharSequence charSequence = this.f558582g;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence)) {
            return charSequence;
        }
        int i17 = this.f558584i;
        if (i17 <= 0) {
            return "";
        }
        java.lang.String string = context.getResources().getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    public final void j(boolean z17) {
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
            }
        }
    }

    public void k(boolean z17) {
        android.widget.TextView textView = this.f558585j;
        if (textView != null) {
            if (z17) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            } else {
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            }
        }
    }

    public k(int i17) {
        this.f558582g = "";
        this.f558583h = "";
        this.f558584i = i17;
    }

    public k(java.lang.String title, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f558582g = "";
        this.f558583h = "";
        this.f558582g = title;
        this.f558584i = i17;
    }
}
