package fy4;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fy4.e f348788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fy4.e eVar, java.lang.String str) {
        super(0);
        this.f348788d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fy4.e eVar = this.f348788d;
        if (!eVar.f348792d.isFinishing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = eVar.f348792d.f265348f;
            if (!c22633x83752a59.f292909y) {
                c22633x83752a59.mo14660x738236e6("(function() { window.__bottomInputBarInsertHardBreak ? window.__bottomInputBarInsertHardBreak() : (function() {\n  var activeElement = document.activeElement;\n  if (!activeElement) return;\n  if (activeElement.nodeName === 'TEXTAREA') {\n    var oldValue = activeElement.value;\n    var selectionStart = activeElement.selectionStart;\n    activeElement.value = oldValue.slice(0, selectionStart) + '\\n' + oldValue.slice(activeElement.selectionEnd);\n    activeElement.selectionStart = selectionStart + 1;\n    activeElement.selectionEnd = selectionStart + 1;\n    activeElement.dispatchEvent(new Event('input'));\n  } else if (activeElement.getAttribute('contenteditable') === 'true') {\n    var selection = window.getSelection();\n    if (selection.rangeCount > 0) {\n      var range = selection.getRangeAt(0);\n      var br = document.createElement('br');\n      range.insertNode(br);\n      range.setStartAfter(br);\n      range.setEndAfter(br);\n      selection.removeAllRanges();\n      selection.addRange(range);\n      activeElement.dispatchEvent(new Event('input'));\n    }\n  }\n})(); })()", fy4.b.f348787a);
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebviewInputConnectionHelper", "webview is isFinishing, skip insertLineBreak");
        return jz5.f0.f384359a;
    }
}
