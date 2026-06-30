package fl5;

/* loaded from: classes15.dex */
public class m implements fl5.a {
    public m(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22662x5b8d7ea8 c22662x5b8d7ea8) {
    }

    public void a(java.lang.Throwable th6, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("Content", str);
        hashMap.put("Exception", th6.toString());
        hashMap.put("Stack", th6.getStackTrace());
        jx3.f.INSTANCE.i("CustomEditView", str2, hashMap);
    }
}
