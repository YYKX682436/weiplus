package j5;

/* loaded from: classes13.dex */
public class c extends l4.b {
    public c(j5.d dVar, l4.q qVar) {
        super(qVar);
    }

    @Override // l4.w
    public java.lang.String b() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.b
    public void d(p4.i iVar, java.lang.Object obj) {
        j5.a aVar = (j5.a) obj;
        java.lang.String str = aVar.f379261a;
        if (str == null) {
            ((q4.h) iVar).mo145066x37fcf764(1);
        } else {
            ((q4.h) iVar).mo145067x35198eae(1, str);
        }
        java.lang.String str2 = aVar.f379262b;
        if (str2 == null) {
            ((q4.h) iVar).mo145066x37fcf764(2);
        } else {
            ((q4.h) iVar).mo145067x35198eae(2, str2);
        }
    }
}
