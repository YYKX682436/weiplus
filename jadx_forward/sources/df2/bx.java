package df2;

/* loaded from: classes10.dex */
public final class bx extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jx f311365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(df2.jx jxVar) {
        super(0);
        this.f311365d = jxVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        km2.q a76 = ((mm2.o4) this.f311365d.m56788xbba4bfc0(mm2.o4.class)).a7();
        xh2.i iVar = new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, 0L, 2032, null);
        iVar.f536086e = 1;
        linkedList.add(new xh2.a(a76, iVar));
        int i17 = 1;
        while (i17 < 9) {
            xh2.i iVar2 = new xh2.i(0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, false, 0, 0, 0L, 2032, null);
            i17++;
            iVar2.f536086e = i17;
            iVar2.f536089h = true;
            linkedList.add(new xh2.a(null, iVar2));
        }
        return linkedList;
    }
}
