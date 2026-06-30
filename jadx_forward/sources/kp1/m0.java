package kp1;

/* loaded from: classes11.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 f392455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3) {
        super(0);
        this.f392455d = c12881xbe3683d3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList;
        bw5.mc0 mc0Var;
        java.util.LinkedList linkedList2;
        bw5.g60 g60Var;
        java.util.LinkedList linkedList3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3 = this.f392455d;
        bw5.xb0 xb0Var = c12881xbe3683d3.f174547x;
        java.lang.String m13326x7531c8a2 = xb0Var != null ? xb0Var.m13326x7531c8a2() : null;
        android.widget.TextView textView = c12881xbe3683d3.f174542s;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendTitle");
            throw null;
        }
        boolean z17 = true;
        if (m13326x7531c8a2 == null || m13326x7531c8a2.length() == 0) {
            m13326x7531c8a2 = textView.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjd);
        }
        textView.setText(m13326x7531c8a2);
        bw5.xb0 xb0Var2 = c12881xbe3683d3.f174547x;
        java.lang.String str = xb0Var2 != null ? xb0Var2.f116586p[4] ? xb0Var2.f116580g : "" : null;
        android.widget.TextView textView2 = c12881xbe3683d3.f174543t;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendDesc");
            throw null;
        }
        if (str == null || str.length() == 0) {
            str = textView2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjc);
        }
        textView2.setText(str);
        qk.w8 w8Var = (qk.w8) i95.n0.c(qk.w8.class);
        bw5.xb0 xb0Var3 = c12881xbe3683d3.f174547x;
        ((ef0.m3) w8Var).getClass();
        java.lang.String str2 = (xb0Var3 == null || (linkedList2 = xb0Var3.f116582i) == null || (g60Var = (bw5.g60) kz5.n0.Z(linkedList2)) == null || (linkedList3 = g60Var.f109234e) == null) ? null : (java.lang.String) kz5.n0.Z(linkedList3);
        if (str2 == null || str2.length() == 0) {
            android.widget.ImageView imageView = c12881xbe3683d3.f174540q;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendCover");
                throw null;
            }
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78568xfb6bff55);
            c12881xbe3683d3.q();
        } else {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            android.widget.ImageView imageView2 = c12881xbe3683d3.f174540q;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendCover");
                throw null;
            }
            ((dl4.m0) tVar).aj(str2, imageView2, 0, new kp1.k0(c12881xbe3683d3));
        }
        qk.w8 w8Var2 = (qk.w8) i95.n0.c(qk.w8.class);
        bw5.xb0 xb0Var4 = c12881xbe3683d3.f174547x;
        ((ef0.m3) w8Var2).getClass();
        java.lang.String b17 = (xb0Var4 == null || (linkedList = xb0Var4.f116581h) == null || (mc0Var = (bw5.mc0) kz5.n0.Z(linkedList)) == null) ? null : mc0Var.b();
        if (b17 != null && b17.length() != 0) {
            z17 = false;
        }
        if (z17) {
            android.widget.ImageView imageView3 = c12881xbe3683d3.f174541r;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendUserAvatar");
                throw null;
            }
            imageView3.setVisibility(8);
        } else {
            android.widget.ImageView imageView4 = c12881xbe3683d3.f174541r;
            if (imageView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendUserAvatar");
                throw null;
            }
            imageView4.setVisibility(0);
            ff0.t tVar2 = (ff0.t) i95.n0.c(ff0.t.class);
            android.widget.ImageView imageView5 = c12881xbe3683d3.f174541r;
            if (imageView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recommendUserAvatar");
                throw null;
            }
            ((dl4.m0) tVar2).aj(b17, imageView5, 0, new kp1.l0(c12881xbe3683d3));
        }
        return jz5.f0.f384359a;
    }
}
