package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public class p implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q f164725a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q qVar) {
        this.f164725a = qVar;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.q qVar = this.f164725a;
        qVar.f164736i.putExtra("KSendGroupToDo", bundle.getBoolean("is_group_to_do"));
        qVar.f164736i.putExtra("custom_send_text", str);
        nf.g.a(qVar.f164731d.f164788a).g(qVar.f164737m.f164706g, z17 ? -1 : 0, qVar.f164736i);
    }
}
