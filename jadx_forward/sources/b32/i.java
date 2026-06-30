package b32;

/* loaded from: classes10.dex */
public final class i implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e f99172a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e) {
        this.f99172a = c13397xbda8fd8e;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = this.f99172a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13397xbda8fd8e.f180226d, "[onSelectedEmoji] emojiInfo:%s", emojiInfo);
        r22.c presenter = c13397xbda8fd8e.getPresenter();
        if (presenter != null) {
            ((w22.v) presenter).b(emojiInfo, null);
        }
        mo9754xc39a57c1();
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        this.f99172a.a(false);
    }
}
