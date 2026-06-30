package f72;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult f341569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f72.b f341570e;

    public a(f72.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult faceResult) {
        this.f341570e = bVar;
        this.f341569d = faceResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult faceResult = this.f341569d;
        if (faceResult != null && faceResult.f35499xc84dc81d == 0) {
            try {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.h().concat("/release_out.fd");
                r45.mi miVar = new r45.mi();
                miVar.f462065d = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(faceResult.f35500xcf84981);
                miVar.f462066e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(faceResult.f35498x2eefaa);
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.l(miVar.mo14344x5f01b1f6(), str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceUtils", e17, "", new java.lang.Object[0]);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_face_result_code", 0);
            bundle.putString("key_face_result_file_path", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 c13518xbbec6ce6 = this.f341570e.f341571a;
            c13518xbbec6ce6.getClass();
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.setData(bundle);
            c13518xbbec6ce6.j(obtain);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceUtils", "face result is null or result code not 0");
        str = null;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("key_face_result_code", 0);
        bundle2.putString("key_face_result_file_path", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 c13518xbbec6ce62 = this.f341570e.f341571a;
        c13518xbbec6ce62.getClass();
        android.os.Message obtain2 = android.os.Message.obtain();
        obtain2.what = 1;
        obtain2.setData(bundle2);
        c13518xbbec6ce62.j(obtain2);
    }
}
