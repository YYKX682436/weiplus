package tl;

/* loaded from: classes14.dex */
public class x implements android.media.AudioRecord.OnRecordPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.y f501709a;

    public x(tl.y yVar) {
        this.f501709a = yVar;
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onMarkerReached(android.media.AudioRecord audioRecord) {
    }

    @Override // android.media.AudioRecord.OnRecordPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioRecord audioRecord) {
        tl.y yVar = this.f501709a;
        yVar.getClass();
        android.media.AudioRecord audioRecord2 = yVar.f501711d;
        if (audioRecord2 != null) {
            if (yVar.f501715h || yVar.f501714g == null) {
                yVar.f501714g = new byte[yVar.f501717j];
            }
            int read = audioRecord2.read(yVar.f501714g, 0, yVar.f501717j);
            tl.e0 e0Var = yVar.f501578a;
            if (e0Var != null) {
                ((tl.u) e0Var).a(read, yVar.f501714g);
            }
            byte[] bArr = yVar.f501714g;
            if (read > bArr.length) {
                read = bArr.length;
            }
            if (yVar.f501718k && read > 0) {
                java.util.Arrays.fill(bArr, 0, read, (byte) 0);
            }
            tl.c cVar = yVar.f501713f;
            if (cVar == null || read <= 0) {
                return;
            }
            cVar.b(yVar.f501714g, read);
        }
    }
}
