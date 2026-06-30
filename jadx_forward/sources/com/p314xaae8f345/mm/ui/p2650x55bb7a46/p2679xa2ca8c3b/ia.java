package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ia extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if ((erVar instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go) && qn4.y.e(f9Var.m124847x74d37ac6(), 3)) {
            return;
        }
        if (!f9Var.X2()) {
            if (f9Var.b3() && (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332)) {
                ge5.d a17 = ge5.d.a();
                java.lang.CharSequence text = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view).getText();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = erVar.c();
                a17.getClass();
                ge5.d.b(text, c17, 1);
                return;
            }
            return;
        }
        yb5.d dVar2 = this.f280025d;
        if (dVar2 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.putExtra("enter_from_scene", 3);
            ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(dVar2.g(), intent, false);
        }
    }
}
