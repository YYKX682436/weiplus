package sq3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsq3/b;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lsq3/a;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "plugin-priority_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class b extends com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b<sq3.a> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n75.b dbProvider) {
        super(dbProvider);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dbProvider, "dbProvider");
    }

    @Override // com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b, l75.c1
    /* renamed from: O6 */
    public java.lang.String getF449889h() {
        return "MicroMsg.C2CPreDownloadStorage";
    }

    public final void X6(java.lang.String msgItemId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
        p75.n0 n0Var = dm.n1.f320134u;
        n0Var.getClass();
        p75.m0 j17 = dm.n1.f320135v.j(msgItemId);
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CPreDownloadStorage", "deleteByMsgId >> msgItemId:" + msgItemId + ", result:" + new p75.i(n0Var.b(), j17.b(), j17.e()).f(this.f274680g.Q4()));
    }

    public final sq3.a Y6(java.lang.String msgItemId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
        p75.m0 j17 = dm.n1.f320135v.j(msgItemId);
        p75.i0 i17 = dm.n1.f320134u.i();
        i17.f434189c = "MicroMsg.C2CPreDownloadStorage";
        i17.f434190d = j17;
        return (sq3.a) i17.a().o(this.f274680g.Q4(), sq3.a.class);
    }

    public final void Z6(java.lang.String msgItemId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("MsgItemId", msgItemId);
        sq3.a aVar = (sq3.a) T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(sq3.a.class));
        if (aVar == null || aVar.t0() != 0) {
            return;
        }
        aVar.L0(c01.id.c());
        com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(this, aVar, false, false, 6, null);
    }

    public final void a7(java.lang.String msgItemId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("MsgItemId", msgItemId);
        sq3.a aVar = (sq3.a) T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(sq3.a.class));
        if (aVar != null) {
            aVar.W0(aVar.J0() - j17);
            aVar.d1(aVar.z0() <= 0 ? 3 : 1);
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(this, aVar, false, false, 6, null);
        }
    }

    public final void b7(java.lang.String msgItemId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("MsgItemId", msgItemId);
        sq3.a aVar = (sq3.a) T6(contentValues, p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(sq3.a.class));
        if (aVar == null || aVar.I0() == 3) {
            return;
        }
        aVar.d1(i17);
        if (i17 == 3 || i17 == 5) {
            aVar.W0(0L);
        }
        com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.W6(this, aVar, false, false, 6, null);
    }
}
