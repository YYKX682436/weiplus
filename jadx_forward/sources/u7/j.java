package u7;

/* loaded from: classes7.dex */
public final class j extends android.os.Handler implements u7.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f506589d;

    public j(java.lang.String str, java.util.List list) {
        super(android.os.Looper.getMainLooper());
        this.f506589d = list;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        for (u7.b bVar : this.f506589d) {
            java.io.File file = (java.io.File) message.obj;
            int i17 = message.arg1;
            u7.j jVar = (u7.j) bVar;
            android.os.Message obtainMessage = jVar.obtainMessage();
            obtainMessage.arg1 = i17;
            obtainMessage.obj = file;
            jVar.sendMessage(obtainMessage);
        }
    }
}
