package l00;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l00.l f396262d = new l00.l();

    public l() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(value)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "invoke success: " + ((com.p314xaae8f345.p2845xc516c4b6.ecs.C23650x66dc5ec0) value).m87660xe591acbc());
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEcsGiftFlutterPlugin", "invoke failed: " + m143898xd4a2fc34);
        }
        return jz5.f0.f384359a;
    }
}
