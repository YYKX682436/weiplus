package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/SignatureEditText;", "Lcom/tencent/mm/ui/widget/MMEditText;", "Landroid/text/Editable;", "getOriginText", "getText", "", "G", "Z", "getAllowEmptyLine", "()Z", "setAllowEmptyLine", "(Z)V", "allowEmptyLine", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.SignatureEditText */
/* loaded from: classes12.dex */
public final class C15378x7431170f extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 {

    /* renamed from: G, reason: from kotlin metadata */
    public boolean allowEmptyLine;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15378x7431170f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cs(this));
        setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ds(this));
        this.f293619q.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.es(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOriginText */
    public final android.text.Editable m62469x7df21d69() {
        android.text.Editable text = super.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        return text;
    }

    public final boolean getAllowEmptyLine() {
        return this.allowEmptyLine;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
    /* renamed from: getRealEditText */
    public fl5.i mo61840xc52e48b() {
        return this;
    }

    /* renamed from: setAllowEmptyLine */
    public final void m62471x69e88e9a(boolean z17) {
        this.allowEmptyLine = z17;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        android.text.Editable text = super.getText();
        if (!this.allowEmptyLine) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(text);
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(?m)^[ \t]*\r?\n");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile.matcher(text).replaceAll(""), "replaceAll(...)");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(text);
        return text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15378x7431170f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cs(this));
        setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ds(this));
        this.f293619q.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.es(this));
    }
}
