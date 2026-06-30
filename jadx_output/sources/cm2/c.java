package cm2;

/* loaded from: classes3.dex */
public final class c extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f43333e;

    public c(yz5.a onAddRole) {
        kotlin.jvm.internal.o.g(onAddRole, "onAddRole");
        this.f43333e = onAddRole;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dnr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        cm2.d item = (cm2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.itemView.setOnClickListener(new cm2.b(this));
    }
}
