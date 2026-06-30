package bd2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd2.i f100809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f100810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f100811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(bd2.i iVar, long j17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        super(1);
        this.f100809d = iVar;
        this.f100810e = j17;
        this.f100811f = y1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList reasons = (java.util.LinkedList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reasons, "reasons");
        bd2.i iVar = this.f100809d;
        iVar.f100795d.addAll(reasons);
        iVar.f100796e = this.f100810e;
        iVar.m8146xced61ae5();
        this.f100811f.s();
        return jz5.f0.f384359a;
    }
}
