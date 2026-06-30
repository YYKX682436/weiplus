package fz4;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f348836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f348837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f348838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f348839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f348840h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.ArrayList arrayList, int i17, yz5.l lVar) {
        super(1);
        this.f348836d = obj;
        this.f348837e = f0Var;
        this.f348838f = arrayList;
        this.f348839g = i17;
        this.f348840h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.Object obj2 = this.f348836d;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f348837e;
        java.util.ArrayList arrayList = this.f348838f;
        int i17 = this.f348839g;
        yz5.l lVar = this.f348840h;
        synchronized (obj2) {
            f0Var.f391649d++;
            if (list != null) {
                arrayList.addAll(list);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "processMediaAsync task complete, completedTasks: " + f0Var.f391649d + ", pendingTasks: " + i17);
            if (f0Var.f391649d >= i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "processMediaAsync all tasks complete, total results: " + arrayList.size());
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                lVar.mo146xb9724478(arrayList);
            }
        }
        return jz5.f0.f384359a;
    }
}
