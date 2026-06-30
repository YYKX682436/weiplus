package c01;

/* loaded from: classes11.dex */
public class d implements com.tencent.mm.vfs.b7 {
    public d(c01.f fVar) {
    }

    @Override // com.tencent.mm.vfs.b7
    public boolean a(com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        return str.equals("EnMicroMsg.db") || str.startsWith("EnMicroMsg.dberr") || str.equals("FTS5IndexMicroMsg_encrypt.db");
    }
}
