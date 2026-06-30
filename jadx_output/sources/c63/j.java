package c63;

/* loaded from: classes12.dex */
public final class j implements lt.k0 {
    public boolean b(long j17) {
        return (j17 >= 4500001 && j17 <= 5000000) || (j17 >= 208000001 && j17 <= 308000000);
    }

    public final c63.i c(ot0.t tVar) {
        kotlin.jvm.internal.o.g(tVar, "<this>");
        c63.i iVar = new c63.i();
        iVar.field_appId = tVar.field_appId;
        iVar.field_description = tVar.field_description;
        iVar.field_msgId = tVar.field_msgId;
        iVar.field_source = tVar.field_source;
        iVar.field_title = tVar.field_title;
        iVar.field_type = tVar.field_type;
        iVar.field_xml = tVar.field_xml;
        return iVar;
    }
}
