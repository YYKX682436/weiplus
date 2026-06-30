package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class gc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {

    /* renamed from: g, reason: collision with root package name */
    public android.text.style.CharacterStyle f285564g;

    public gc(yb5.d dVar) {
        super(dVar);
        this.f285564g = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if ((erVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) && qn4.y.e(f9Var.m124847x74d37ac6(), 3)) {
            return;
        }
        if (f9Var.X2()) {
            yb5.d dVar2 = this.f280025d;
            if (dVar2 != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                intent.putExtra("enter_from_scene", 3);
                ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(dVar2.g(), intent, false);
            }
        } else if (f9Var.b3() && (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332)) {
            ge5.d a17 = ge5.d.a();
            java.lang.CharSequence text = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view).getText();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
            a17.getClass();
            ge5.d.b(text, c17, 1);
        }
        if (j65.e.b() && j65.e.f()) {
            if ((!j65.e.g() || j65.e.h()) && ((z17 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039))) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
                java.lang.CharSequence a18 = c22624x85d69039.a();
                if (f9Var.A0() == 1) {
                    this.f285564g = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
                } else {
                    this.f285564g = new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
                }
                java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).f280592e == valueOf.longValue() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).f280593f == valueOf.longValue()) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).w0(dVar, true);
                    return;
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append(a18.subSequence(0, a18.length())).setSpan(this.f285564g, 0, a18.length(), 33);
                if (z17) {
                    c22624x85d69039.b(spannableStringBuilder);
                }
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) ((sb5.i2) dVar.f542241c.a(sb5.i2.class))).r0(dVar, f9Var, a18);
                sb5.i2 i2Var = (sb5.i2) dVar.f542241c.a(sb5.i2.class);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fc fcVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fc(this, view, a18);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm fmVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fm) i2Var;
                fmVar.getClass();
                fmVar.f280596i = fcVar;
            }
        }
    }
}
