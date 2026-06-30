package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* renamed from: com.tencent.mm.ui.chatting.component.z4$$d */
/* loaded from: classes9.dex */
public final /* synthetic */ class C21741x6cf62aa implements java.util.function.Function {
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        ot0.q v17;
        oi3.g gVar = (oi3.g) obj;
        if (g45.c.a(gVar)) {
            return "image";
        }
        int i17 = gVar.f427150d;
        if (gVar.m75939xb282bd08(i17 + 4) == 43) {
            return "video";
        }
        int i18 = i17 + 4;
        if (gVar.m75939xb282bd08(i18) == 62) {
            return "shortVideo";
        }
        return ((gVar.m75939xb282bd08(i18) & 65535) == 49 && gVar.m75939xb282bd08(i18) != 1107296305) && (v17 = ot0.q.v(gVar.m75945x2fec8307(i17 + 13))) != null && ez.v0.f339310a.j(java.lang.Integer.valueOf(v17.f430199i)) ? "file" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
    }
}
