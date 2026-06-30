package l4;

/* loaded from: classes13.dex */
public class t extends p4.c {

    /* renamed from: b, reason: collision with root package name */
    public l4.a f397291b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.r f397292c;

    public t(l4.a aVar, l4.r rVar, java.lang.String str, java.lang.String str2) {
        super(rVar.f397288a);
        this.f397291b = aVar;
        this.f397292c = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0076 A[EDGE_INSN: B:90:0x0076->B:79:0x0076 BREAK  A[LOOP:4: B:58:0x0020->B:80:?], SYNTHETIC] */
    @Override // p4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(p4.b r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.t.b(p4.b, int, int):void");
    }

    public final void c(p4.b bVar) {
        q4.c cVar = (q4.c) bVar;
        cVar.c("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.c("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }
}
