package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.p2270x5c4d208;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/convert/topic/error/TopicErrorLayout;", "Landroid/widget/LinearLayout;", "Lbi4/s0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.convert.topic.error.TopicErrorLayout */
/* loaded from: classes11.dex */
public final class C18602xa9b36ec3 extends android.widget.LinearLayout implements bi4.s0 {
    public C18602xa9b36ec3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        new ej4.a0(a17, this, null, 4, null);
        setOrientation(1);
    }

    @Override // bi4.s0
    public void I5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicErrorLayout", "update updateByStatusId:" + str);
    }

    @Override // bi4.s0
    public void b4(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicErrorLayout", "update username:" + str);
        boolean z17 = false;
        if (str != null && str.equals(en1.a.a())) {
            z17 = true;
        }
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new pi4.d(this, null), 2, null);
        }
    }

    public C18602xa9b36ec3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String a17 = en1.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
        new ej4.a0(a17, this, null, 4, null);
        setOrientation(1);
    }
}
