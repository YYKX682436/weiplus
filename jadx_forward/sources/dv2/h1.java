package dv2;

/* loaded from: classes2.dex */
public final class h1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.j1 f325397d;

    public h1(dv2.j1 j1Var) {
        this.f325397d = j1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz> list = (java.util.List) obj;
        dv2.j1 j1Var = this.f325397d;
        j1Var.f325411h.clear();
        j1Var.f325411h.addAll(list);
        java.util.ArrayList arrayList = j1Var.f325410g;
        arrayList.clear();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz lzVar : list) {
            java.lang.String str = lzVar.f216633d;
            if (str == null) {
                str = "";
            }
            ya2.b2 b17 = ya2.h.f542017a.b(str);
            if (b17 == null) {
                b17 = new ya2.b2(str);
                java.lang.String str2 = lzVar.f216630a;
                if (str2 == null) {
                    str2 = "";
                }
                b17.f69328x21f9b213 = str2;
                java.lang.String str3 = lzVar.f216631b;
                b17.f69301x81118c51 = str3 != null ? str3 : "";
            }
            arrayList.add(new so2.v1(b17));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = j1Var.f325412i;
        if (c22848x6ddd90cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c22848x6ddd90cf.m8146xced61ae5();
        if (list.isEmpty()) {
            android.widget.TextView textView = j1Var.f325409f;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView.setText(j1Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p4z));
            android.widget.TextView textView2 = j1Var.f325409f;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = j1Var.f325409f;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
