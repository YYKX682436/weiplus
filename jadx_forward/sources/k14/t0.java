package k14;

/* loaded from: classes11.dex */
public class t0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final int f384915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f384916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f384917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f384918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f384919h;

    public t0(k14.x0 x0Var, int i17, java.util.List list, java.util.LinkedList linkedList, long j17) {
        this.f384919h = x0Var;
        this.f384916e = list;
        this.f384917f = linkedList;
        this.f384918g = j17;
        this.f384915d = i17;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        java.util.List list = vVar.f432693e;
        if (list == null || list.size() <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f384916e == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] list is null? %s ", objArr);
        } else {
            p13.y yVar = (p13.y) list.get(0);
            java.lang.Object obj = yVar.f432730o;
            if (obj == null || !(obj instanceof java.util.HashMap)) {
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                objArr2[0] = java.lang.Boolean.valueOf(obj == null);
                objArr2[1] = java.lang.Boolean.valueOf(yVar.f432730o instanceof java.util.HashMap);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] is null?%s is instanceof List", objArr2);
            } else {
                java.util.HashMap hashMap = (java.util.HashMap) obj;
                synchronized (this.f384919h.f384940f) {
                    for (java.lang.String str : this.f384916e) {
                        if (hashMap.containsKey(str)) {
                            java.util.Iterator it = ((java.util.List) hashMap.get(str)).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((p13.y) it.next()).f432719d < 100) {
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    z17 = false;
                                    break;
                                }
                            }
                            if (!z17) {
                                this.f384919h.f384943i.add(str);
                            }
                        } else {
                            this.f384919h.f384943i.add(str);
                        }
                    }
                }
            }
        }
        if (this.f384915d < this.f384917f.size()) {
            this.f384919h.a(this.f384917f, this.f384915d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnfamiliarContactEngine", "[getSameChatInfoTask] finish all load! userNames.size:%s cost:%sms", java.lang.Integer.valueOf(this.f384917f.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f384918g));
            this.f384919h.f384938d.countDown();
        }
    }
}
