package w13;

/* loaded from: classes12.dex */
public final class a extends o13.a {
    @Override // o13.a
    public boolean C() {
        return !i(-110, 3);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) this.f423731f).q(-110L, 3L);
        }
    }

    @Override // o13.u
    /* renamed from: getName */
    public java.lang.String mo9549xfb82e301() {
        return "FTS5ChatroomMemberStorage";
    }

    @Override // o13.u
    /* renamed from: getPriority */
    public int mo9550x3662b71a() {
        return 5;
    }

    @Override // o13.u
    /* renamed from: getType */
    public int mo9551xfb85f7b0() {
        return 5;
    }

    @Override // o13.a
    public java.lang.String n() {
        java.lang.String format = java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (docid INTEGER PRIMARY KEY, type INT, subtype INT DEFAULT 0, entity_id INTEGER, aux_index TEXT, timestamp INTEGER, status INT DEFAULT 0);", java.util.Arrays.copyOf(new java.lang.Object[]{r()}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    @Override // o13.a
    public java.lang.String p() {
        return "MicroMsg.FTS.FTS5ChatroomMemberStorage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "ChatroomMember";
    }
}
