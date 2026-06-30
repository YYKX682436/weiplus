package cn5;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 f125228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f125229e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2, int i17) {
        super(0);
        this.f125228d = c22824x40bb30c2;
        this.f125229e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2 = this.f125228d;
        c22824x40bb30c2.m82869x65f3de96(false);
        cn5.k onOpenDrawerListener = c22824x40bb30c2.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(true, false, this.f125229e);
        }
        return jz5.f0.f384359a;
    }
}
