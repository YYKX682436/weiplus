package y43;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly43/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (c10756x2a5d7b2d == null) {
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        java.lang.String str = c10756x2a5d7b2d.f149939d;
        y43.f fVar = (y43.f) i95.n0.c(y43.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        y43.e e17 = fVar.e(str);
        y43.m mVar = y43.m.f540888a;
        if (e17 == null) {
            y43.m.a(mVar, str);
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (java.lang.System.currentTimeMillis() - e17.f68183xa783a79b > e17.f68182x7654871d) {
            y43.m.a(mVar, str);
        } else if (java.lang.System.currentTimeMillis() - e17.f68183xa783a79b > e17.f68179x61c4976f) {
            ((y43.f) i95.n0.c(y43.f.class)).d(str);
        }
        if (!e17.f68180x6822e1e7) {
            if (rVar != null) {
                rVar.a(null);
            }
        } else if (rVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appid", e17.f68178x28d46377);
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e17.f68181x2260084a);
            bundle.putString("wepkg_id", e17.f68185xb772261);
            rVar.a(bundle);
        }
    }
}
