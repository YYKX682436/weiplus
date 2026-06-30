package b4;

/* loaded from: classes13.dex */
public class a extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4.d f99294a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b4.d dVar, android.os.Looper looper) {
        super(looper);
        this.f99294a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int size;
        b4.b[] bVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        b4.d dVar = this.f99294a;
        while (true) {
            synchronized (dVar.f99304b) {
                size = dVar.f99306d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b4.b[size];
                dVar.f99306d.toArray(bVarArr);
                dVar.f99306d.clear();
            }
            for (int i17 = 0; i17 < size; i17++) {
                b4.b bVar = bVarArr[i17];
                int size2 = bVar.f99296b.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    b4.c cVar = (b4.c) bVar.f99296b.get(i18);
                    if (!cVar.f99300d) {
                        cVar.f99298b.onReceive(dVar.f99303a, bVar.f99295a);
                    }
                }
            }
        }
    }
}
