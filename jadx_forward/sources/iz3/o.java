package iz3;

/* loaded from: classes12.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry3.q f377624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ry3.q qVar) {
        super(1);
        this.f377624d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ry3.o oVar;
        iz3.j jVar = (iz3.j) obj;
        if (jVar != null) {
            jz5.g gVar = kz3.d.f395405a;
            ry3.q qVar = this.f377624d;
            java.lang.String valueOf = java.lang.String.valueOf(qVar.f483076a);
            kz3.a aVar = new kz3.a();
            ry3.p pVar = jVar.f377617a;
            java.lang.String str = (pVar == null || (oVar = pVar.f483074o) == null) ? null : oVar.f483059a;
            if (str == null) {
                str = "";
            }
            aVar.f395397a = str;
            java.lang.String str2 = qVar.f483085j;
            aVar.f395398b = str2 != null ? str2 : "";
            boolean z17 = true;
            aVar.f395399c = 1;
            if (valueOf != null && valueOf.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                kz3.d.f395406b.put(valueOf, aVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
