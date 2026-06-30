package jl;

/* loaded from: classes13.dex */
public class d extends ll.n {

    /* renamed from: g, reason: collision with root package name */
    public jl.e f381724g;

    public d(jl.e eVar, java.lang.String str, int i17) {
        super(str, i17);
        this.f381724g = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jl.e eVar = this.f381724g;
        if (eVar != null) {
            eVar.a();
            this.f381724g.end();
        }
        this.f381724g = null;
        ll.m.c(this);
    }
}
