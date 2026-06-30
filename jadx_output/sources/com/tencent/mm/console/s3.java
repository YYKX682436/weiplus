package com.tencent.mm.console;

/* loaded from: classes10.dex */
public class s3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        com.tencent.mm.autogen.events.ShellExecEvent shellExecEvent = new com.tencent.mm.autogen.events.ShellExecEvent();
        am.lu luVar = shellExecEvent.f54777g;
        luVar.f7274b = "wechat.shell.FINDER_VIDEO_TEST";
        luVar.f7273a = intent;
        shellExecEvent.e();
    }
}
