package s;

/* loaded from: classes13.dex */
public class a implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.c f483357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s.b f483358e;

    public a(s.b bVar, s.c cVar) {
        this.f483358e = bVar;
        this.f483357d = cVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        p012xc85e97e9.p020x8ff2b28.p022xa1c79e6f.AbstractServiceC0105x4c575d06 abstractServiceC0105x4c575d06 = this.f483358e.f483359d;
        s.c cVar = this.f483357d;
        abstractServiceC0105x4c575d06.getClass();
        try {
            synchronized (abstractServiceC0105x4c575d06.f91298d) {
                android.os.IBinder asBinder = cVar.f483360a.asBinder();
                asBinder.unlinkToDeath((android.os.IBinder.DeathRecipient) ((x.n) abstractServiceC0105x4c575d06.f91298d).m174751x4aabfc28(asBinder, null), 0);
                ((x.n) abstractServiceC0105x4c575d06.f91298d).m174754xc84af884(asBinder);
            }
        } catch (java.util.NoSuchElementException unused) {
        }
    }
}
