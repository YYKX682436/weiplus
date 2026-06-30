package v61;

@j95.b
/* loaded from: classes.dex */
public final class w0 extends i95.w implements com.p314xaae8f345.mm.p670x38b72420.m {
    public final java.lang.String wi() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"unavailable_account_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d49);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append(" $unavailable_tips_detail$]]></template>\n                  <link_list>\n                    <link name=\"unavailable_tips_detail\" type=\"link_unavailable_tips_url\">\n                      <title>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572132zl));
        sb6.append("</title>\n                    </link>\n                  </link_list>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        ");
        return r26.b0.b(sb6.toString());
    }
}
