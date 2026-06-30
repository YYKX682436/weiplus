package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class hf implements k01.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf f285639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.a f285640b;

    public hf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.Cif cif, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf lfVar, ot0.a aVar) {
        this.f285639a = lfVar;
        this.f285640b = aVar;
    }

    @Override // k01.w0
    public void a(java.lang.String str, r45.zr6 zr6Var) {
        tt0.e Ai;
        java.lang.String str2 = zr6Var.f473874f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.lf lfVar = this.f285639a;
        android.widget.TextView textView = lfVar.f286005k;
        if (textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "viewHolder.appbrandUpdateTv is null, return");
            return;
        }
        java.lang.String str3 = (java.lang.String) textView.getTag();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgWxaDynamicTo", "oriShareKey is null, return");
            return;
        }
        if (str3.equals(str)) {
            lfVar.f286005k.setVisibility(0);
            lfVar.f286005k.setText(zr6Var.f473874f);
            android.widget.TextView textView2 = lfVar.f286005k;
            textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(zr6Var.f473875g, textView2.getCurrentTextColor()));
            ot0.a aVar = this.f285640b;
            if (aVar.f429891n == 0 && zr6Var.f473877i == 1 && (Ai = ((oh1.k2) ((k01.x0) i95.n0.c(k01.x0.class))).Ai(str)) != null && Ai.f66299x9ac5f93a == 1) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f429888k)) {
                    lfVar.f286013s.setVisibility(8);
                } else {
                    lfVar.f286013s.setVisibility(0);
                    lfVar.f286013s.setText(aVar.f429888k);
                }
            }
        }
    }
}
