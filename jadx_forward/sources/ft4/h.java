package ft4;

/* loaded from: classes14.dex */
public final class h extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft4.i f348151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.j f348152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ft4.i iVar, ft4.j jVar) {
        super(false);
        this.f348151d = iVar;
        this.f348152e = jVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        ft4.a aVar = this.f348151d.f348162n;
        if (aVar != null) {
            aVar.a(this.f348152e);
        }
    }
}
