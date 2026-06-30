package kq5;

/* loaded from: classes7.dex */
public class a implements kq5.b {
    @Override // kq5.b
    /* renamed from: loadLibrary */
    public void mo32130xeb57c8f5(java.lang.String str) {
        for (int i17 = 0; i17 < 3; i17++) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/wemedia/delegate/WeMediaLoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tencent/mm/wemedia/delegate/WeMediaLoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                kq5.g.a("hi.LoadDelegate", "loadSo " + str + " success!", new java.lang.Object[0]);
                return;
            } catch (java.lang.NullPointerException e17) {
                kq5.g.f392821a.e("hi.LoadDelegate", "loadSo " + str + " failed NullPointerException " + (e17.getMessage() == null ? "null" : e17.getMessage()), new java.lang.Object[0]);
            } catch (java.lang.SecurityException e18) {
                kq5.g.f392821a.e("hi.LoadDelegate", "loadSo " + str + " failed SecurityException " + (e18.getMessage() == null ? "null" : e18.getMessage()), new java.lang.Object[0]);
            } catch (java.lang.UnsatisfiedLinkError e19) {
                kq5.g.f392821a.e("hi.LoadDelegate", "loadSo " + str + " failed UnsatisfiedLinkError " + (e19.getMessage() == null ? "null" : e19.getMessage()), new java.lang.Object[0]);
            } catch (java.lang.Throwable th6) {
                kq5.g.b("hi.LoadDelegate", th6, "loadSo", new java.lang.Object[0]);
            }
        }
    }
}
