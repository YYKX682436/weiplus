package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class zn extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {

    /* renamed from: g, reason: collision with root package name */
    public android.text.style.CharacterStyle f287702g;

    public zn(yb5.d dVar) {
        super(dVar);
        this.f287702g = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (f9Var.X2()) {
            yb5.d dVar2 = this.f280025d;
            if (dVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10221, "1");
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                intent.putExtra("enter_from_scene", 3);
                ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(dVar2.g(), intent, false);
                return;
            }
            return;
        }
        if (f9Var.b3()) {
            if (j65.e.b() && j65.e.f() && (!j65.e.g() || j65.e.h())) {
                java.lang.String text = view instanceof android.widget.TextView ? ((android.widget.TextView) view).getText() : view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 ? ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).a() : "";
                long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
                long j17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).f280592e;
                long j18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).f280593f;
                if (j17 == m124847x74d37ac6 || j18 == m124847x74d37ac6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextClickListener", "speechPlaying stop!!");
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).w0(dVar, true);
                } else {
                    if (j17 != 0 || j18 != 0) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).w0(dVar, true);
                    }
                    qn4.y.d(4);
                    if (f9Var.A0() == 1) {
                        this.f287702g = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
                    } else {
                        this.f287702g = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
                    }
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    spannableStringBuilder.append(text.subSequence(0, text.length())).setSpan(this.f287702g, 0, text.length(), 33);
                    if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) {
                        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view).b(spannableStringBuilder);
                    }
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).r0(dVar, f9Var, text);
                    sb5.i2 i2Var = (sb5.i2) dVar.f542241c.a(sb5.i2.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yn ynVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.yn(this, view, text);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) i2Var;
                    fmVar.getClass();
                    fmVar.f280596i = ynVar;
                }
            }
            if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) {
                ge5.d a17 = ge5.d.a();
                java.lang.CharSequence text2 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view).getText();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
                a17.getClass();
                ge5.d.b(text2, c17, 1);
            }
        }
    }
}
