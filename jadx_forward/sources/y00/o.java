package y00;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f540073d;

    public o(java.util.HashMap hashMap, y00.p pVar) {
        this.f540073d = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        for (java.util.Map.Entry entry : this.f540073d.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(a10.e.f82023a.a().J0(str, list)));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardOnMsgChanged", m143898xd4a2fc34, "removeBatch fail talker=%s ids=%d", str, java.lang.Integer.valueOf(list.size()));
            }
        }
    }
}
