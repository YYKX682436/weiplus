package r15;

/* loaded from: classes12.dex */
public abstract class c {
    public static final void a(r15.b bVar, org.xmlpull.v1.XmlSerializer serializer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serializer, "serializer");
        r15.i n17 = bVar.n();
        if (n17 == null) {
            return;
        }
        serializer.startTag(null, "extcommoninfo");
        serializer.startTag(null, "refermsg");
        serializer.startTag(null, "svrid");
        serializer.text(n17.l() + "");
        serializer.endTag(null, "svrid");
        serializer.startTag(null, "signature");
        serializer.text(n17.m161301x3f6b0a02());
        serializer.endTag(null, "signature");
        serializer.startTag(null, "strid");
        serializer.text(n17.k());
        serializer.endTag(null, "strid");
        serializer.startTag(null, "createtime");
        serializer.text(n17.m161300x3fdd41df() + "");
        serializer.endTag(null, "createtime");
        serializer.endTag(null, "refermsg");
        serializer.endTag(null, "extcommoninfo");
    }
}
