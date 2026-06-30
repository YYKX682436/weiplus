package b4;

/* loaded from: classes13.dex */
public class a extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4.d f17761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b4.d dVar, android.os.Looper looper) {
        super(looper);
        this.f17761a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int size;
        b4.b[] bVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        b4.d dVar = this.f17761a;
        while (true) {
            synchronized (dVar.f17771b) {
                size = dVar.f17773d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b4.b[size];
                dVar.f17773d.toArray(bVarArr);
                dVar.f17773d.clear();
            }
            for (int i17 = 0; i17 < size; i17++) {
                b4.b bVar = bVarArr[i17];
                int size2 = bVar.f17763b.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    b4.c cVar = (b4.c) bVar.f17763b.get(i18);
                    if (!cVar.f17767d) {
                        cVar.f17765b.onReceive(dVar.f17770a, bVar.f17762a);
                    }
                }
            }
        }
    }
}
