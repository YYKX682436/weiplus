package hw2;

/* loaded from: classes5.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String str, java.util.HashMap hashMap, int i17) {
        try {
            hw2.h hVar = hw2.t.f367087v;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderRecordBeautifyPlugin", "extractJsonToMap: " + str);
            cl0.g gVar = new cl0.g(str);
            hashMap.put(0, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("skin_smooth", i17)));
            hashMap.put(1, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("face_morph", i17)));
            hashMap.put(4, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("eye_morph", i17)));
            hashMap.put(2, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("skin_bright", i17)));
            hashMap.put(5, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("eye_bright", i17)));
            hashMap.put(3, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("rosy", i17)));
            hashMap.put(6, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("eye_pouch", i17)));
            hashMap.put(7, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("smile_folds", i17)));
            hashMap.put(8, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("sharpen", i17)));
            hashMap.put(9, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("teeth_bright", i17)));
            hashMap.put(10, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("small_head", i17)));
            hashMap.put(11, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("cheek_bone", i17)));
            hashMap.put(12, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("lower_jawbone", i17)));
            hashMap.put(13, java.lang.Integer.valueOf(gVar.mo15080xc3ca103c("wing_of_nose", i17)));
        } catch (java.lang.Exception e17) {
            hw2.h hVar2 = hw2.t.f367087v;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FinderRecordBeautifyPlugin", e17, "json error: ", new java.lang.Object[0]);
        }
    }
}
