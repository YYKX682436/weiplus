package aw1;

/* loaded from: classes12.dex */
public final class p extends ot1.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f14629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.database.Cursor cursor, java.util.HashSet hashSet) {
        super(cursor);
        this.f14629e = hashSet;
    }

    @Override // ot1.g
    public java.lang.Object j(android.database.Cursor cursor) {
        kotlin.jvm.internal.o.g(cursor, "cursor");
        int i17 = cursor.getInt(0);
        java.lang.String b17 = ot1.d.b(cursor.getString(3));
        long j17 = cursor.getLong(4);
        long j18 = cursor.getLong(2);
        if ((1 & j17) != 0) {
            this.f14629e.add(new jz5.l(b17 == null ? "talker-ignore" : b17, java.lang.Long.valueOf(j18)));
        }
        if (i17 != 3 && i17 != 23) {
            return null;
        }
        ot1.h hVar = new ot1.h();
        hVar.field_msgSubType = i17;
        hVar.field_diskSpace = cursor.getLong(1);
        hVar.field_msgId = j18;
        hVar.field_username = b17;
        hVar.field_flags = j17;
        return hVar;
    }
}
