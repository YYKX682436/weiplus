package c13;

/* loaded from: classes11.dex */
public final class z implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c13.z f37935d = new c13.z();

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        if (lVar != null) {
            com.tencent.pigeon.flutter_voip.FLRoomInfo fLRoomInfo = new com.tencent.pigeon.flutter_voip.FLRoomInfo(((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).longValue());
            com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
            if (voIPFlutterApi != null) {
                voIPFlutterApi.onRoomReady(fLRoomInfo, c13.y.f37934d);
            }
        }
    }
}
