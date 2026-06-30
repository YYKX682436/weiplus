package ui3;

/* loaded from: classes5.dex */
public class b extends dm.e8 {

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f509646x = dm.e8.m124951x3593deb(ui3.b.class);

    /* renamed from: clone */
    public java.lang.Object m168089x5a5dd5d() {
        ui3.b bVar = new ui3.b();
        try {
            bVar.f72763xa3c65b86 = this.f72763xa3c65b86;
            bVar.f66416x297eb4f7 = this.f66416x297eb4f7;
            bVar.f66417xd09be28e = this.f66417xd09be28e;
            bVar.f66418xb3e44c2f = this.f66418xb3e44c2f;
            bVar.f66419x34d46056 = this.f66419x34d46056;
            bVar.f66421x10a0fed7 = this.f66421x10a0fed7;
            bVar.f66420x66425b6d = this.f66420x66425b6d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.msgquote.MsgQute", "clone() Exception:%s %s", e17.getClass(), e17.getMessage());
        }
        return bVar;
    }

    @Override // dm.e8, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f509646x;
    }

    /* renamed from: toString */
    public java.lang.String m168090x9616526c() {
        return "MsgQute{field_msgId=" + this.f66416x297eb4f7 + ", field_msgSvrId=" + this.f66417xd09be28e + ", field_quotedMsgId=" + this.f66418xb3e44c2f + ", field_quotedMsgSvrId=" + this.f66419x34d46056 + ", field_status=" + this.f66421x10a0fed7 + ", systemRowid=" + this.f72763xa3c65b86 + ", field_quotedMsgTalker=" + this.f66420x66425b6d + '}';
    }
}
