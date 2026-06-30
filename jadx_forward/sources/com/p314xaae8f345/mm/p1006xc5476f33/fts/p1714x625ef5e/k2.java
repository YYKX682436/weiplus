package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class k2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219116q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f219116q = l2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchTypeMessage";
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        o("start");
        vVar.f432693e = new java.util.LinkedList();
        w13.h hVar = this.f219116q.f219142h;
        p13.u uVar = this.f432668n;
        android.database.Cursor q17 = hVar.q1(uVar.f432679h, uVar.f432675d);
        while (q17.moveToNext()) {
            p13.y yVar = new p13.y();
            yVar.f432717b = q17.getInt(0);
            yVar.f432718c = q17.getInt(1);
            yVar.f432719d = q17.getLong(2);
            yVar.f432720e = q17.getString(3);
            yVar.f432721f = q17.getLong(4);
            yVar.f432722g = q17.getString(5);
            vVar.f432693e.add(yVar);
        }
        q17.close();
    }
}
