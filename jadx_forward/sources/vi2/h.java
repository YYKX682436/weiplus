package vi2;

/* loaded from: classes10.dex */
public class h implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public vi2.g f519083d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.xn1 f519084e;

    public h(vi2.g inviteState, r45.xn1 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inviteState, "inviteState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        this.f519083d = inviteState;
        this.f519084e = contact;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f519084e.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 4;
    }
}
