package j11;

/* loaded from: classes11.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f378670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j11.o f378671g;

    public n(j11.o oVar, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f378671g = oVar;
        this.f378668d = str;
        this.f378669e = str2;
        this.f378670f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f378668d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String str2 = this.f378669e;
        if (str2 == null) {
            str2 = "";
        }
        objArr[1] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetContactService", "callback user:%s alias:%s", objArr);
        synchronized (this) {
            linkedList = (java.util.LinkedList) ((java.util.HashMap) this.f378671g.f378672d.f378647c).remove(this.f378668d);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f378669e)) {
                linkedList2 = null;
            } else {
                linkedList2 = (java.util.LinkedList) ((java.util.HashMap) this.f378671g.f378672d.f378647c).remove(this.f378669e);
            }
        }
        if (linkedList != null) {
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            java.lang.String str3 = this.f378668d;
            if (str3 == null) {
                str3 = "";
            }
            objArr2[0] = str3;
            objArr2[1] = java.lang.Integer.valueOf(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetContactService", "callback userCallbackContainer user:%s size:%s", objArr2);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((c01.o8) it.next()).a(this.f378668d, this.f378670f);
            }
        }
        if (linkedList2 != null) {
            java.lang.Object[] objArr3 = new java.lang.Object[2];
            java.lang.String str4 = this.f378668d;
            if (str4 == null) {
                str4 = "";
            }
            objArr3[0] = str4;
            objArr3[1] = java.lang.Integer.valueOf(linkedList2.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetContactService", "callback aliasCallbackContainer user:%s size:%s", objArr3);
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                ((c01.o8) it6.next()).a(this.f378668d, this.f378670f);
            }
        }
    }
}
