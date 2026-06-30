package wr3;

/* loaded from: classes11.dex */
public final class v extends wr3.f0 {

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f530431x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.ref.WeakReference f530432y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f530433z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, java.lang.String bizUsername, boolean z17, int i17, long j17, boolean z18, sr3.g config, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, final p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        super(context, bizUsername, z17, i17, j17, z18, config, contact);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f530431x = jz5.h.b(wr3.t.f530411d);
        this.f530432y = new java.lang.ref.WeakReference(this);
        this.f530433z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(lifecycleOwner) { // from class: com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabAudioAdapter$tingPlayerListener$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 event = c5722xb16ab0f4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                wr3.v vVar = this;
                wr3.v vVar2 = (wr3.v) vVar.f530432y.get();
                if (vVar2 == null) {
                    return false;
                }
                int i18 = event.f136045g.f88569b;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) vVar.f530431x).mo141623x754a37bb()).mo50293x3498a0(new wr3.u(vVar2));
                return false;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    @Override // wr3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r25, int r26) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wr3.v.L(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // wr3.f0
    public wr3.c0 N(wr3.n0 status, r45.s5 message, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        return new wr3.s(status, message, i17);
    }

    @Override // wr3.f0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 O(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3c, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new yr3.c1(this, inflate, this.f530317s.g());
    }

    @Override // wr3.f0
    public int P() {
        return 1;
    }

    @Override // wr3.f0
    public int Q() {
        return 2;
    }

    @Override // wr3.f0
    public int R() {
        return 0;
    }
}
