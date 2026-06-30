package df;

/* loaded from: classes7.dex */
public final class l extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams f311040f;

    public l(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams) {
        this.f311040f = cronetRequestParams;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SkylineCronetRequest@" + this.f311040f.f18180xcb7ef180;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        java.lang.String str = this.f311039e;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTaskId");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37941xd93b98fc(str);
        java.lang.Object obj = df.n.f311056g;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = this.f311040f;
        synchronized (obj) {
            java.util.HashSet hashSet = df.n.f311055f;
            if (hashSet.contains(cronetRequestParams.f18180xcb7ef180)) {
                hashSet.remove(cronetRequestParams.f18180xcb7ef180);
                df.n.f311053d--;
                java.util.LinkedList linkedList = df.n.f311054e;
                if ((!linkedList.isEmpty()) && (runnable = (java.lang.Runnable) linkedList.pollFirst()) != null) {
                    runnable.run();
                }
            }
        }
    }
}
