package gk4;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f354167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gk4.h0 h0Var) {
        super(1);
        this.f354167d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gk4.h0 h0Var;
        dk4.a aVar;
        kk4.b it = (kk4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        kk4.v vVar = (kk4.v) it;
        kk4.c cVar = vVar.f390110b;
        long mo100924x2d67b867 = cVar != null ? ((kk4.f0) cVar).mo100924x2d67b867(205) : 0L;
        kk4.c cVar2 = vVar.f390110b;
        int mo100929x8d5c7601 = cVar2 != null ? ((kk4.f0) cVar2).mo100929x8d5c7601() : 0;
        kk4.c cVar3 = vVar.f390110b;
        int mo100928x463504c = cVar3 != null ? ((kk4.f0) cVar3).mo100928x463504c() : 0;
        gk4.h0 h0Var2 = this.f354167d;
        dk4.a aVar2 = vVar.f390111c;
        h0Var2.f354113y = aVar2;
        if (mo100929x8d5c7601 > 0 && mo100928x463504c > 0 && mo100924x2d67b867 >= 0) {
            if (aVar2 != null) {
                aVar2.f316018v = mo100929x8d5c7601;
            }
            if (aVar2 != null) {
                aVar2.f316019w = mo100928x463504c;
            }
            h0Var2.f354098j = mo100929x8d5c7601;
            this.f354167d.f354099k = mo100928x463504c;
            dk4.a aVar3 = this.f354167d.f354113y;
            if (aVar3 != null) {
                aVar3.f316007k = (int) mo100924x2d67b867;
            }
        }
        if ((!this.f354167d.f354112x.isEmpty()) && (aVar = (h0Var = this.f354167d).f354113y) != null) {
            h0Var.f354114z = h0Var.f354112x.indexOf(aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354167d.f354089a, "onPlayStarted player width:" + mo100929x8d5c7601 + ", height:" + mo100928x463504c + ", rotate: " + mo100924x2d67b867 + ", currentMediaInfoIndex:" + this.f354167d.f354114z + ", playerPosition:" + vVar.o());
        return jz5.f0.f384359a;
    }
}
