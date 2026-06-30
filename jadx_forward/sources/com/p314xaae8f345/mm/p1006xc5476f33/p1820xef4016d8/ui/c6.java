package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f228311a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f228312b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f228313c = false;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f228314d;

    public boolean a(int i17, boolean z17) {
        android.widget.TextView textView;
        this.f228313c = false;
        this.f228312b = false;
        int i18 = 0;
        while (true) {
            java.util.List list = this.f228311a;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 d6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6) ((java.util.LinkedList) list).get(i18);
            int c17 = d6Var.c();
            if (c17 != 0) {
                d6Var.a();
                g(d6Var.d(c17));
                this.f228313c = true;
            } else {
                d6Var.b();
            }
            i18++;
        }
        if (!this.f228313c && (textView = this.f228314d) != null) {
            textView.setVisibility(8);
            this.f228312b = false;
        }
        return this.f228313c;
    }

    public boolean b() {
        android.widget.TextView textView;
        this.f228313c = false;
        this.f228312b = false;
        int i17 = 0;
        while (true) {
            java.util.List list = this.f228311a;
            if (i17 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 d6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6) ((java.util.LinkedList) list).get(i17);
            int e17 = d6Var.e();
            if (e17 == 0 || this.f228313c) {
                d6Var.b();
            } else {
                d6Var.a();
                g(d6Var.d(e17));
                this.f228313c = true;
            }
            i17++;
        }
        if (!this.f228313c && (textView = this.f228314d) != null) {
            textView.setVisibility(8);
            this.f228312b = false;
        }
        return this.f228313c;
    }

    public boolean c() {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f228311a;
            if (i17 >= ((java.util.LinkedList) list).size()) {
                return false;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6) ((java.util.LinkedList) list).get(i17)).c() != 0) {
                return true;
            }
            i17++;
        }
    }

    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 d6Var) {
        if (d6Var == null) {
            return;
        }
        java.util.List list = this.f228311a;
        if (((java.util.LinkedList) list).contains(d6Var)) {
            return;
        }
        ((java.util.LinkedList) list).add(d6Var);
    }

    public void e() {
        ((java.util.LinkedList) this.f228311a).clear();
    }

    public void f(java.lang.String str) {
        if (this.f228314d != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f228314d.setText(str);
            this.f228314d.setVisibility(0);
            this.f228312b = true;
        } else {
            android.widget.TextView textView = this.f228314d;
            if (textView != null) {
                textView.setVisibility(8);
                this.f228312b = false;
            }
        }
    }

    public void g(java.lang.String str) {
        if (this.f228314d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (!this.f228312b) {
            this.f228314d.setText(str);
        }
        this.f228314d.setVisibility(0);
        this.f228314d.sendAccessibilityEvent(32768);
        this.f228312b = true;
    }
}
