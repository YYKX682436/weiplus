package yo4;

/* loaded from: classes10.dex */
public final class a implements yo4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18793x66a884d5 f545700a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18793x66a884d5 c18793x66a884d5) {
        this.f545700a = c18793x66a884d5;
    }

    @Override // yo4.b
    public void a(int i17) {
        yo4.b callback = this.f545700a.getCallback();
        if (callback != null) {
            callback.a(i17);
        }
    }
}
