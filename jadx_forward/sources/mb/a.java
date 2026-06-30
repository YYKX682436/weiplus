package mb;

/* loaded from: classes9.dex */
public class a implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mb.e f406810d;

    public a(mb.e eVar) {
        this.f406810d = eVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        mb.e eVar = this.f406810d;
        mb.d dVar = eVar.f406816d;
        if (dVar != null) {
            ((nz2.l) dVar).a(2101, -1, eVar.f406817e, -1);
        }
    }
}
